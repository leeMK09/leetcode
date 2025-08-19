SELECT e.name as Employee from Employee as e 
    LEFT JOIN Employee as m ON m.id = e.managerId
    WHERE e.salary > m.salary