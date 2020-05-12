package exercises;

import java.util.Collections;
import java.util.List;

public class _3_JobCandidateSelectorUsingLambdas{
	public static void main(String[] args) {
		JobCandidate jobCandidate = new JobCandidate();
		List<JobCandidate> candidates= JobCandidate.jobCandidates;
		int salary = jobCandidate.getSalaryRequired();
		// 1. Sort the candidates by salary requirements, low to high.
		
		Collections.sort(candidates, );

		// 2. Filter out any candidates that have not been taught by me (June)
		// Hint: see the removeIf() method in the Collections class
		
		
	}
}
