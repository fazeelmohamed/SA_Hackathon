package com.sliit.sa.service;

import com.sliit.sa.model.Advertisement;

import java.util.List;

public interface AdvertisementDAO {

	public List<Advertisement> getAllAdvertisements();
	
	public Advertisement findByID(int advID);
	
	public void updateApproval(Advertisement advertisement);
	
	public void updateApprovals(Advertisement[] advertisements);//Multiple blog approvals
}
