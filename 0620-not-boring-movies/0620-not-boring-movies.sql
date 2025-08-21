SELECT id, movie, description,rating FROM Cinema as c
    WHERE MOD(c.id, 2) = 1 AND c.description NOT LIKE '%boring%'
    ORDER BY c.rating DESC