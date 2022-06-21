package com.greatlearning.springdemo;

public class FootballCoach implements SportCoach {

	private ExpertAdvice expertAdvice;

	@Override
	public String getTrainingSchedule() {

		return "For Football -> In morning 5 AM to 8 AM";
	}

	public void setExpertAdvice(ExpertAdvice expertAdvice) {
		this.expertAdvice = expertAdvice;
	}

	@Override
	public String getAdvice() {
		return "For Football ->" + expertAdvice.getAdvice();
	}

}
