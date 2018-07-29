package com.oocl.SpringBoot.many.to.many.repositories;

import com.oocl.SpringBoot.many.to.many.entities.Group;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class GroupRepositoryTest {
    @Autowired
    private GroupRepository repository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void should_return_the_group_with_id() throws Exception{
        Group savedGroup = entityManager.persistFlushFind(new Group("快乐小组"));
        Group group = repository.findByName("快乐小组");

        Assertions.assertThat(group.getName()).isEqualTo(savedGroup.getName());
    }
}