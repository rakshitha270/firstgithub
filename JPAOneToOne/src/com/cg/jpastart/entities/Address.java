package com.cg.jpastart.entities;


	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	public class Address  implements Serializable{
		private static final long serialversionUID=1L;
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int addressid;
		@Column(name="street")
		private String Street;
		@Column(name="state")
		private String state;
		@Column(name="city")
		private String city;
		@Column(name="zipcode")
		private int zipcode;
		public int getAddressid() {
			return addressid;
		}
		public void setAddressid(int addressid) {
			this.addressid = addressid;
		}
		public String getStreet() {
			return Street;
		}
		public void setStreet(String street) {
			Street = street;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getZipcode() {
			return zipcode;
		}
		public void setZipcode(int zipcode) {
			this.zipcode = zipcode;
		}
		public static long getSerialversionuid() {
			return serialversionUID;
		}
	}

