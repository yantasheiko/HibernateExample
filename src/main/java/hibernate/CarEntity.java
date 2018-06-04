package hibernate; 
 
import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import javax.persistence.UniqueConstraint; 
 
import org.hibernate.annotations.OptimisticLockType; 
 
@Entity 
@org.hibernate.annotations.Entity(optimisticLock = OptimisticLockType.ALL, 
	dynamicUpdate = true) 
@Table(name = "Car", uniqueConstraints = { 
        @UniqueConstraint(columnNames = "ID") }) 
public class CarEntity { 
 
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "ID", unique = true, nullable = false) 
    private Integer carId; 
 
    @Column(name = "CAR_NAME", unique = false, nullable = false, length = 100) 
    private String carName; 
 
    @Column(name = "CAR_MODEL", unique = false, nullable = false, length = 100) 
    private String carModel; 

	public Integer getCarId() {

		return carId;

	}


	public void setCarId(Integer carId) {

		this.carId = carId;

	}


	public String getCarName() {

		return carName;

	}


	public void setCarName(String carName) {

		this.carName = carName;

	}



	public String getCarModel() {

		return carModel;

	}


	public void setCarModel(String carModel) {

		this.carModel = carModel;

	}


 
} 