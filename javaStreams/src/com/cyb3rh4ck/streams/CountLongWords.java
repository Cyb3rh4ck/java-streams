package com.cyb3rh4ck.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountLongWords {
	
	/**
	 * 
	 * @param args
	 * @throws IOException
	 * 
	 * The stream and parallelStream methods yield a stream for the words list. 
	 * The filter method returns another stream that contains only the words of 
	 * length greater than 12. The count method reduces that stream to a result.
	 *
	 * This workflow is typical when you work with streams. You set up a pipeline 
	 * of operations in three stages:
	 *	
	 * 1.- Create a stream.
	 * 2.- Specify intermediate operations for transforming the initial stream into 
	 *     others, possibly in multiple steps.
	 * 3.- Apply a terminal operation to produce a result. This operation forces the 
	 *     execution of the lazy operations that precede it. Afterwards, the stream 
	 *     can no longer be used.
	 * 
	 * In the example the stream is created with the stream or parallelStream methods. 
	 * The filter method transforms it, and count is the terminal operation.
	 * 
	 */
	
	public static void main(String... args) throws IOException {
		
		String contents = Files.readString(Path.of("../README.md"));
		List<String> words = List.of(contents.split("\\PL+"));
		
		long count = 0;
		for (String w : words) {
			if (w.length() > 12)
				count++;
		}
		System.out.println(count);
		
		count = words.stream().filter(w -> w.length() > 12).count();
		System.out.println(count);
		
		count = words.parallelStream().filter(w -> w.length() > 12).count();
		System.out.println(count);
		
	}

}
