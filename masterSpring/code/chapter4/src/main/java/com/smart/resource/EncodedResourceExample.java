package com.smart.resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.util.FileCopyUtils;

import java.io.FileWriter;

public class EncodedResourceExample {
	  public static void main(String[] args) throws Throwable  {
		  Resource res = new ClassPathResource("conf/file2.txt");
		  EncodedResource encRes = new EncodedResource(res,"UTF-8");
		  String content  = FileCopyUtils.copyToString(encRes.getReader());
		  System.out.println(content);
		  FileWriter file = new FileWriter("Z:/masterSpring/code/UTF-8file.txt");
		  file.write(content);
		  file.flush();
		  file.close();

		  res = new ClassPathResource("conf/file2.txt");
		  encRes = new EncodedResource(res,"GBK");
		  content  = FileCopyUtils.copyToString(encRes.getReader());
		  System.out.println(content);
		  file = new FileWriter("Z:/masterSpring/code/gbkfile.txt");
		  file.write(content);
	}
}
