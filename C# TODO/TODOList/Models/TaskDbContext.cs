namespace TODOList.Models
{
    using System;
    using System.Data.Entity;
    using System.Linq;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.Data.Entity.Infrastructure;

    public class TaskDbContext : DbContext
    {
        public TaskDbContext()
            : base("name=TaskDbContext")
        {
        }
        
        public virtual DbSet<Task> Tasks { get; set; }

    }
}