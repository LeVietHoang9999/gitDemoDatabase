package demoPackage;

public class jobPerson {
	private jobCareer job;
	public jobPerson() {//tao constructor, invoke doi tuong jobCareer. goi cac phuong thuc cuar no
		this.job = new jobCareer();//khai bao doi tuong
		job.setSalary(1000L);
		job.setRole("SEO");
	}
	public long getSalary() {
		return job.getSalary();
	}
	public String getRole() {
		return job.getRole();
	}
}
