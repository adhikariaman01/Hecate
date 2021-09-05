/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.hecate.growth.licensingservice.service;

import com.hecate.growth.licensingservice.model.License;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LicenseService {

    public License getLicense(String licenseId,String organizationId){
        License license = new License();
        license.setId(new Random().nextInt(1000));
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setDescription("Software Product");
        license.setProductName("Hecate Stock");
        license.setLicenseType("full");
        return license;
    }

    public String createLicense(License license,String organizationId){
        String responseMessage = null;
        if(null != license){
            license.setOrganizationId(organizationId);
            responseMessage = String.format("This is the post and object is : %s",license.toString());
        }
        return responseMessage;
    }

    public String updateLicense(License license,String organizationId){
        String responseMessage = null;
        if(null != license){
            license.setOrganizationId(organizationId);
            responseMessage = String.format("This is the put and object is : %s",license.toString());
        }
        return responseMessage;
    }

    public String deleteLicense(String licenseId,String organizationId){
        String responseMessage = null;
        responseMessage = String.format("Deleting License with id %s for the organization %s",licenseId,organizationId);
        return responseMessage;
    }
}
