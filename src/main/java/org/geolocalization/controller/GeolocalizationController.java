package org.geolocalization.controller;

import java.util.List;
import org.geolocalization.model.Geolocalization;
import org.geolocalization.service.GeolocalizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeolocalizationController {
	@Autowired
	private GeolocalizationService geolocalizationService;

	@GetMapping("/geolocalization")
	public List<Geolocalization> lista() {
		return geolocalizationService.getAllDevices();

	}

}
