package ch13;

import java.nio.ByteBuffer;

public class BufferDemo {
    public static void main(String[] args) {
        ByteBuffer buf = ByteBuffer.allocate(10);

        System.out.println(buf);

        buf.put("ab". getBytes());
        System.out.println(buf);

        buf.put("cde".getBytes());
        System.out.println(buf);

        buf.flip();
        System.out.println(buf);

        System.out.println(new String(buf.array()));

        buf.clear();
        System.out.println(buf);
    }
}
