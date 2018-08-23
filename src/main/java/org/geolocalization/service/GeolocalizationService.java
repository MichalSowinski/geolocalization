package org.geolocalization.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.geolocalization.model.Geolocalization;
import org.geolocalization.repository.GeolocalizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeolocalizationService {

	@Autowired
	private GeolocalizationRepository geolocalizationRepository;

	@PostConstruct
	public void createDataFromDevice() {
		Geolocalization geolocalization = new Geolocalization();
		geolocalization.setLatitiude(345679);
		geolocalization.setLongitude(5435934);
		geolocalizationRepository.save(geolocalization);
		
		Geolocalization geolocalization2 = new Geolocalization();
		geolocalization2.setLatitiude(654589);
		geolocalization2.setLongitude(2435931);
		geolocalizationRepository.save(geolocalization2);
		
		Geolocalization geolocalization3 = new Geolocalization();
		geolocalization3.setLatitiude(255679);
		geolocalization3.setLongitude(2135911);
		geolocalizationRepository.save(geolocalization3);
		
		Geolocalization geolocalization4 = new Geolocalization();
		geolocalization4.setLatitiude(255679);
		geolocalization4.setLongitude(1535934);
		geolocalizationRepository.save(geolocalization4);
		
		

	}

	public List<Geolocalization> getAllDevices() {
		return geolocalizationRepository.findAll();

	}

}
