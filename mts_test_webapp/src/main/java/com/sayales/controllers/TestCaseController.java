package com.sayales.controllers;


import com.sayales.api.MTSTestTaskApi;
import com.sayales.api.dto.TracksDTO;
import com.sayales.service.TrackService;
import com.sayales.service.TrackServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCaseController implements MTSTestTaskApi {

    private final TrackService service;

    public TestCaseController(TrackServiceImpl service) {
        this.service = service;
    }

    @Override
    @PostMapping("/saveTracks")
    public void saveTracks(@RequestBody TracksDTO tracks) {
        System.out.println(tracks);

        service.saveTracks(tracks);
    }

    @Override
    @GetMapping("/trackList")
    public TracksDTO getTracks() {
        return service.getTracks();
    }


}
