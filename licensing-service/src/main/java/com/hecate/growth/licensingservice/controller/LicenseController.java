/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.hecate.growth.licensingservice.controller;

import com.hecate.growth.licensingservice.model.License;
import com.hecate.growth.licensingservice.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/organization/{organizationId}/license")
public class LicenseController {

    @Autowired
    private LicenseService licenseService;

    @GetMapping(value = "/{licenseId}")
    public ResponseEntity<License> getLicense(@PathVariable("organizationId")String organizationId,
                                              @PathVariable("licenseId")String licenseId){
        License license = licenseService.getLicense(licenseId,organizationId);
        license.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(LicenseController.class)
                        .getLicense(organizationId, license.getLicenseId()))
                        .withSelfRel(),
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(LicenseController.class)
                        .createLicense(organizationId, license))
                        .withRel("createLicense"),
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(LicenseController.class)
                        .updateLicense(organizationId, license))
                        .withRel("updateLicense"),
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(LicenseController.class)
                        .deleteLicense(organizationId, license.getLicenseId()))
                        .withRel("deleteLicense"));
        return ResponseEntity.ok(license);
    }

    @PutMapping
    public ResponseEntity<String> updateLicense(@PathVariable("organizationId")String organizationId,
                                              @RequestBody License request){
        return ResponseEntity.ok(licenseService.updateLicense(request,organizationId));
    }

    @PostMapping
    public ResponseEntity<String> createLicense(@PathVariable("organizationId")String organizationId,
                                                @RequestBody License request){
        return ResponseEntity.ok(licenseService.createLicense(request,organizationId));
    }

    @DeleteMapping(value = "/{licenseId}")
    public ResponseEntity<String> deleteLicense(@PathVariable("organizationId")String organizationId,
                                                @PathVariable("licenseId")String licenseId){
        return ResponseEntity.ok(licenseService.deleteLicense(licenseId,organizationId));
    }

}