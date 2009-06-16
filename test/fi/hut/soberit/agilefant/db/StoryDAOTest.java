package fi.hut.soberit.agilefant.db;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import fi.hut.soberit.agilefant.test.AbstractHibernateTests;

@ContextConfiguration
@Transactional
public class StoryDAOTest extends AbstractHibernateTests {

    @Autowired
    private StoryDAO storyDAO;
    
    @Test
    public void testGetStoryPointSumByBacklog_firstBacklog() {
        executeClassSql();
        assertEquals(29, storyDAO.getStoryPointSumByBacklog(1));
    }
    
    @Test
    public void testGetStoryPointSumByBacklog_secondBacklog() {
        executeClassSql();
        assertEquals(33, storyDAO.getStoryPointSumByBacklog(3));
    }
    
}