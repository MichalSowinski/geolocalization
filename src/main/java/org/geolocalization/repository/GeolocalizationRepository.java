package org.geolocalization.repository;

import org.geolocalization.model.Geolocalization;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface GeolocalizationRepository extends JpaRepository<Geolocalization, Long> {

}
