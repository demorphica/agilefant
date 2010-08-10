package fi.hut.soberit.agilefant.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.BatchSize;

/**
 * Hibernate entity bean which represents an hour entry owned by a backlog.
 * 
 * Represents a job effort logged for a specific backlog.
 * 
 * 
 * @see fi.hut.soberit.agilefant.model.HourEntry
 * @author
 * 
 */
@Entity
@BatchSize(size = 20)
public class BacklogHourEntry extends HourEntry {

    private Backlog backlog;

    @ManyToOne
    @XmlTransient
    public Backlog getBacklog() {
        return backlog;
    }

    public void setBacklog(Backlog backlog) {
        this.backlog = backlog;
    }

}
