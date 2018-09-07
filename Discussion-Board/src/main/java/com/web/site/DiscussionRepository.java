package com.web.site;

import com.web.site.entity.Discussion;

import java.util.List;

public interface DiscussionRepository {

    List<Discussion> getAll();
    Discussion get(long id);
    void add(Discussion discussion);
    void update(Discussion discussion);
}