package com.czxy.score.service.impl;
import com.czxy.score.dao.MettingMapper;
import com.czxy.score.domain.Metting;
import com.czxy.score.service.MettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
/**
 * @author super璐
 * @version v 1.0
 * @date 2019/7/25
 */@Service
@Transactional
public class MettingServiceImpl implements MettingService {
@Autowired
private MettingMapper mettingMapper;
@Override
public List<Metting> find() {
return mettingMapper.selectAll();
    }
    //添加
    @Override
    public void insert(Metting metting) {
        mettingMapper.insert(metting);
    }

}
