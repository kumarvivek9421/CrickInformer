package com.crick.apis.services;

import com.crick.apis.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
//    get All Matches
    List<Match> getAllMatches();
//    get Live Matches
    List<Match> getLiveMatches();
//    get CWC2023 point table
    List<List<String>> getPointTable();
}
