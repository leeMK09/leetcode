SELECT DISTINCT email as Email FROM Person as p
    GROUP BY p.email HAVING COUNT(p.email) >= 2