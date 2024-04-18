package com.crick.apis.Service;

import com.crick.apis.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
//    get all matches
    List<Match> getAllMatches();
//    get all live matches
    List<Match> getLiveMatches();
//    get point table
    List<List<String>> getPointTable();
}
