select student.name, student.age, f.name
from student
left join faculty as f on student.faculty_id = f.id;


select student.*
from student
inner join avatar as a on student.avatar_id = a.id;
