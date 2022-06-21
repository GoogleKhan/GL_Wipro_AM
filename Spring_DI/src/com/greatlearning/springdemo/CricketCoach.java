package com.greatlearning.springdemo;

public class CricketCoach implements SportCoach {

	private ExpertAdvice expertAdvice;

	public CricketCoach(ExpertAdvice expertAdvice) {
		this.expertAdvice = expertAdvice;
	}

	@Override
	public String getTrainingSchedule() {

		return "For Cricket -> In evening 5 PM to 8 PM";
	}

	@Override
	public String getAdvice() {
		return "For Cricket ->" + expertAdvice.getAdvice();
	}

}
