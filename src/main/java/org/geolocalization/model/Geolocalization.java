package org.geolocalization.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Geolocalization {
	@Id
	@GeneratedValue
	private long deviceId;
	private long latitiude;
	private long longitude;

	public long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(long deviceId) {
		this.deviceId = deviceId;
	}

	public long getLatitiude() {
		return latitiude;
	}

	public void setLatitiude(long latitiude) {
		this.latitiude = latitiude;
	}

	public long getLongitude() {
		return longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}

}
