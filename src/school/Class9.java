package school;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ClassRoom_9")
public class Class9 {
	
	@Id
	@Column(name="Student_name", nullable=false,length=20)
	private String name;

	@Column(name="Class_name", nullable=false)
	private String section;

	@Column(nullable=false)
	private double current_Percent;

	@Column(nullable=false)
	private double last_Year_Percent;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public double getCurrent_Percent() {
		return current_Percent;
	}

	public void setCurrent_Percent(double current_Percent) {
		this.current_Percent = current_Percent;
	}

	public double getLast_Year_Percent() {
		return last_Year_Percent;
	}

	public void setLast_Year_Percent(double last_Year_Percent) {
		this.last_Year_Percent = last_Year_Percent;
	}
}
