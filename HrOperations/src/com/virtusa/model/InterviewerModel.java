package com.virtusa.model;

public class InterviewerModel 
{
	private int interviewerId;

	public int getInterviewerId() {
		return interviewerId;
	}

	public void setInterviewerId(int interviewerId) {
		this.interviewerId = interviewerId;
	}

	@Override
	public String toString() {
		return "InterviewerModel [interviewerId=" + interviewerId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + interviewerId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InterviewerModel other = (InterviewerModel) obj;
		if (interviewerId != other.interviewerId)
			return false;
		return true;
	}
	
	
	

}
