package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Porder")
public class Porder {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer product1;
	private Integer product2;
	private Integer product3;
	private Integer sum;
	private String name;
	private String phone;
	private String address;
	private String user;

	public Porder() {
		super();
	}

	public Porder(Integer id,Integer p1, Integer p2, Integer p3, String name, String phone, String address, String user) {
		super();
		this.id = id;
		this.product1 = p1;
		this.product2 = p2;
		this.product3 = p3;
		sum = product1 * 50 + product2 * 60 + product3 * 70;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProduct1() {
		return product1;
	}

	public void setProduct1(Integer product1) {
		this.product1 = product1;
	}

	public Integer getProduct2() {
		return product2;
	}

	public void setProduct2(Integer product2) {
		this.product2 = product2;
	}

	public Integer getProduct3() {
		return product3;
	}

	public void setProduct3(Integer product3) {
		this.product3 = product3;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Porder [id=" + id + ", product1=" + product1 + ", product2=" + product2 + ", product3=" + product3
				+ ", sum=" + sum + ", name=" + name + ", phone=" + phone + ", address=" + address + ", user=" + user
				+ "]";
	}

	
}
