package in.sujukia.entity;

import java.time.LocalDate;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;


@Data

@Entity
@Table(name="CITIZEN_PLANS_INFO")
public class CitizenPlan{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "citizen_plans_seq")
    @SequenceGenerator(name = "citizen_plans_seq", sequenceName = "citizen_plans_seq", allocationSize = 1)
	private Integer citizenId;
	private String citizenName;
	private String gender;
	
	private String planName;
	private String planStatus;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private Double benefitAmt;
	private String denialReason;
	private LocalDate terminatedDate;
	private String terminationRsn;
	
}
