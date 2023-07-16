package com.example.studentsmanagement;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

class StudentsManagementApplicationTests {

    @Test
    void testRedis() {
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.set("username", "xiaoming");
        System.out.println(jedis.get("username"));
        jedis.del("username");

        jedis.hset("myhash", "addr", "bj");
        System.out.println(jedis.hget("myhash", "addr"));
        jedis.close();
    }

}
