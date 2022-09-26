package ch.zli.m223.controller;

import javax.inject.Inject;
import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import ch.zli.m223.service.BuchungService;

@Path("/buchung")
@Tag(name = "Buchungen", description = "Handling of Buchungen")
public class BuchungController {
    
    @Inject
    BuchungService buchungService;
}
