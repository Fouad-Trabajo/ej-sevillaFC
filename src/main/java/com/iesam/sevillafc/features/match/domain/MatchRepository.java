package com.iesam.sevillafc.features.match.domain;

import com.iesam.sevillafc.features.match.domain.models.Match;

public interface MatchRepository {
    void createMatch(Match match);

    Match obtainMatch(String id);
}
