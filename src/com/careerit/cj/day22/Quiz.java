package com.careerit.cj.day22;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Quiz {

	private List<Question> questions;
	
	private Map<Integer,String> answers = new HashMap<>();
	
	public Quiz() {
		questions = QuestionReaderUtil.loadQuestions();
		for(Question q:questions) {
			answers.put(q.getId(), q.getAnswer());
		}
	}

	public void startQuiz(String name) {
		Map<Integer,String> userAnswers = new HashMap<>();
		System.out.println("Hi " + name + " your quiz is going start in few seconds please wait.....");
		System.out.println("Quiz has total " + questions.size() + " questions \n\n");
	    TimeUnit obj = TimeUnit.SECONDS;
	    Scanner sc = new Scanner(System.in);
	    try {
			obj.sleep(5);
			for (int i = 0; i < questions.size(); i++) {
				Question question = questions.get(i);
				System.out.println(question.getId() + ". " + question.getQdata()+"\n");
				for (String option : question.getOptions()) {
					System.out.println(option);
				}
				
				String answer = sc.nextLine();
				userAnswers.put(i+1,answer);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		sc.close();
		showResult(userAnswers);
	}

	private void showResult(Map<Integer,String> userAnswers) {
		
			int ccount = 0;
			int wcount = 0;
			
			for(int i=1;i<=questions.size();i++) {
				
					if(answers.get(i).equals(userAnswers.get(i))) {
						ccount++;
					}else {
						wcount++;
					}
			}
			System.out.println("---------------------------------------------------");
			System.out.println("Total Questions         :"+questions.size());
			System.out.println("No of correct answers   :"+ccount);
			System.out.println("No of wrong answers     :"+wcount);
			System.out.println("---------------------------------------------------");
			
			
			
	}
}
