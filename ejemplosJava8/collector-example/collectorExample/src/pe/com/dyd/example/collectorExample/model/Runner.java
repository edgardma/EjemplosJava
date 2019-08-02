package pe.com.dyd.example.collectorExample.model;

public class Runner {
	private Integer dorsal;
	private String name;
	private String surname;
	private Long time;
	private Long penalty;
	private Long endTime;	
	
	public Runner(Integer dorsal, String name, String surname, Long time, Long penalty) {
		super();
		this.dorsal = dorsal;
		this.name = name;
		this.surname = surname;
		this.time = time;
		this.penalty = penalty;
	}
	
	public Integer getDorsal() {
		return dorsal;
	}
	public void setDorsal(Integer dorsal) {
		this.dorsal = dorsal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	public Long getPenalty() {
		return penalty;
	}
	public void setPenalty(Long penalty) {
		this.penalty = penalty;
	}
	public Long getEndTime() {
		return endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}
	
	public void addPenalty() {
		endTime = endTime == null ? time + penalty : endTime;
	}
	
	public int compareTo(Runner anotherRunner) {
		int endTimeCmp = this.endTime.compareTo(anotherRunner.getEndTime());
		int penaltyCmp = this.penalty.compareTo(anotherRunner.getPenalty());
		int dorsalCmp = this.dorsal.compareTo(anotherRunner.getDorsal());
		
		return endTimeCmp != 0 ? endTimeCmp : penaltyCmp != 0 ? penaltyCmp : dorsalCmp;		
	}

	@Override
	public String toString() {
		return "Runner [dorsal=" + dorsal + ", name=" + name + ", surname=" + surname + ", time=" + time + ", penalty="
				+ penalty + ", endTime=" + endTime + "]";
	}
	
}
