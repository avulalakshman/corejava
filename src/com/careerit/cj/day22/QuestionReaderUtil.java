package com.careerit.cj.day22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class QuestionReaderUtil {

	private static final String FILE_NAME = "questions.txt";

	private QuestionReaderUtil() {

	}

	public static List<Question> loadQuestions() {
		List<Question> questions = new ArrayList<Question>();
		
		try {
			List<String> lines = Files.readAllLines(Paths.get(FILE_NAME));
			for (int i = 0; i < lines.size(); i += 3) {
				List<String> subList = lines.subList(i, i + 3);
				int id = Integer.parseInt(subList.get(0).substring(1));
				String qdata = subList.get(1);
				String[] arr = subList.get(2).split(",");
				List<String> options = new ArrayList<String>();
				for (int j = 0; j < arr.length - 1; j++) {
					options.add(arr[j]);
				}
				String answer = arr[arr.length - 1];
				Question question = new Question(id, qdata, options, answer);
				questions.add(question);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return questions;
	}
}
