package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
//        ArrayList<String> events = new ArrayList<>();
        HashMap<String, String> events = new HashMap<>();
        events.put("Code with Pride", "This affinity group meets bi-monthly in order to offer a safe space for LGBTQIA+ technologists and allies to mingle, network, seek help, build mentor/mentee relationships and work for inclusive change in the St. Louis tech community and beyond.");
        events.put("Strange Loop", "Strange Loop is a multi-disciplinary conference that brings together the developers and thinkers building tomorrow's technology in fields such as emerging languages, alternative databases, concurrency, distributed systems, security, and the web.");
        events.put("Apple WWDC", "Apple uses the event to showcase its new software and technologies for software developers. Attendees can participate in hands-on labs with Apple engineers and attend in-depth sessions covering a wide variety of topics.");
        events.put("SpringOne Platform", "The premier conference for those who build, deploy, and run cloud-native software.");
        model.addAttribute("events", events);
        return "events/index";
    }










}
