package org.launchcode.codingevents.controllers;

<<<<<<< HEAD
import org.launchcode.codingevents.data.EventRepository;
import org.launchcode.codingevents.models.Event;
import org.launchcode.codingevents.models.EventType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
=======
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
>>>>>>> 7086f8331ed4f41eb1b85d8cc9a08683d726c89b

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

<<<<<<< HEAD
    @Autowired
    private EventRepository eventRepository;
=======
    private static List<String> events = new ArrayList<>();
>>>>>>> 7086f8331ed4f41eb1b85d8cc9a08683d726c89b

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Events");
<<<<<<< HEAD
        model.addAttribute("events", eventRepository.findAll());
=======
        model.addAttribute("events", events);
>>>>>>> 7086f8331ed4f41eb1b85d8cc9a08683d726c89b
        return "events/index";
    }

    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
<<<<<<< HEAD
        model.addAttribute(new Event());
        model.addAttribute("types", EventType.values());
=======
>>>>>>> 7086f8331ed4f41eb1b85d8cc9a08683d726c89b
        return "events/create";
    }

    @PostMapping("create")
<<<<<<< HEAD
    public String processCreateEventForm(@ModelAttribute @Valid Event newEvent,
                                         Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Create Event");
            return "events/create";
        }

        eventRepository.save(newEvent);
        return "redirect:";
    }

    @GetMapping("delete")
    public String displayDeleteEventForm(Model model) {
        model.addAttribute("title", "Delete Events");
        model.addAttribute("events", eventRepository.findAll());
        return "events/delete";
    }

    @PostMapping("delete")
    public String processDeleteEventsForm(@RequestParam(required = false) int[] eventIds) {

        if (eventIds != null) {
            for (int id : eventIds) {
                eventRepository.deleteById(id);
            }
        }

=======
    public String processCreateEventForm(@RequestParam String eventName) {
        events.add(eventName);
>>>>>>> 7086f8331ed4f41eb1b85d8cc9a08683d726c89b
        return "redirect:";
    }

}
