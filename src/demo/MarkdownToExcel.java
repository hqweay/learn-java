package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hqweay
 * @Description: TODO
 * @date 3/21/21 6:01 PM
 */
public class MarkdownToExcel {
	public static void main(String[] args) {
		try {
			File file = new File("/home/B/hqweay-blog/hexo备份/blog-now/my-mkdocs/docs/life/reading/mark/");
			List<List> allList = new ArrayList<>();
			for (File temp : file.listFiles()) {
				if (temp.isFile()) {
//					System.out.println(temp.getName());
					String text = Files.readString(temp.toPath());
					String[] books = text.split("##");


//			allList.add(new ArrayList<>().add());

					for (int index = 1; index < books.length; index++) {
						String[] oneBookGetName = books[index].split("\n");
						String[] oneBookGetField = books[index].split("---");


						List oneBookExcel = new ArrayList<>();
						List<String> oneMark = new ArrayList<>();
//						for (int newIndex = 0; newIndex < oneBookGetName.length; newIndex++) {
//							if (newIndex == 0 || newIndex == 2) {
//								oneMark.add(oneBookGetName[newIndex]); // 书名
//
//							}
//						}
						if(oneBookGetName.length > 0){
							oneMark.add(oneBookGetName[0].trim()); // 书名
						}
						if(oneBookGetName.length > 2){
							oneMark.add(oneBookGetName[2].trim()); // 作者
						}



						for (int newIndex = 0; newIndex < oneBookGetField.length; newIndex++) {
							 if (!oneBookGetField[newIndex].trim().isBlank()) {
//						System.out.println(newIndex + oneBook[newIndex]);

//								if(newIndex == 0){
////									oneMark.add(oneBookGetName[3].trim()); // 标注
//									if(oneBookGetName.length > 3){
//										oneMark.add(oneBookGetName[4].trim()); // 标注
//									}else{
//										oneMark.add(oneBookGetField[newIndex].trim()); // 标注
//									}
//								}else {
									oneMark.add(oneBookGetField[newIndex].trim()); // 标注
//								}
//							System.out.println(oneBook[newIndex]);
							}
						}
//				oneBookExcel.add(oneMark);
						allList.add(oneMark);
					}

				}
			}

			MarkdownToExcel.writeToExcel(allList);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeToExcel(List<List> allBooks) {
		try {
			PrintWriter out = new PrintWriter("./test.csv");
			for (List<String> oneMark : allBooks) {

				for (int index = 2; index < oneMark.size(); index++) {
					out.write(oneMark.get(0).trim() + "," + oneMark.get(1).trim() + ",章节,\"" + oneMark.get(index).trim() + "\"");
					out.write("\n");
//					System.out.println(field);
				}
				out.write("\n");

			}
			out.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
