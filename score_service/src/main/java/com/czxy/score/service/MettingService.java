package com.czxy.score.service;

import com.czxy.score.domain.Metting;
import com.czxy.score.domain.User;

import java.util.List;

/**
 * @author super璐
 * @version v 1.0
 * @date 2019/7/25
 */
public interface MettingService {
    public List<Metting> find();
    public void insert(Metting metting);
}
