using System;
using System.Data.Entity;
using System.Linq;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Data.Entity.Infrastructure;
using Microsoft.AspNet.Identity.EntityFramework;

namespace TODOList.Models
{
    public class TaskDbContext : DbContext
    {
        public TaskDbContext()
            : base("DefaultConnection")
        {
        }

        public virtual DbSet<Task> Tasks { get; set; }
    }
}