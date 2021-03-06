package com.apap.tutorial4.service;

import java.util.List;

import com.apap.tutorial4.model.PilotModel;

/**
 * PilotService
 * @author Muhammad Aulia Adil
 *
 */
public interface PilotService {
	void addPilot(PilotModel pilot);
	void deletePilot(PilotModel pilot);
//	boolean hasPilot(PilotModel pilot);
	PilotModel getPilotDetailByLicenseNumber(String licenseNumber);
	PilotModel getPilotDetailById(String id);
	List<PilotModel> getAllPilot();
}
