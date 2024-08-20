// Generated by jextract

package dev.jt.tinywl_clj.gen;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct wl_protocol_logger_message {
 *     struct wl_resource *resource;
 *     int message_opcode;
 *     const struct wl_message *message;
 *     int arguments_count;
 *     const union wl_argument *arguments;
 * }
 * }
 */
public class wl_protocol_logger_message {

    wl_protocol_logger_message() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("resource"),
        C.C_INT.withName("message_opcode"),
        MemoryLayout.paddingLayout(4),
        C.C_POINTER.withName("message"),
        C.C_INT.withName("arguments_count"),
        MemoryLayout.paddingLayout(4),
        C.C_POINTER.withName("arguments")
    ).withName("wl_protocol_logger_message");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout resource$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("resource"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wl_resource *resource
     * }
     */
    public static final AddressLayout resource$layout() {
        return resource$LAYOUT;
    }

    private static final long resource$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wl_resource *resource
     * }
     */
    public static final long resource$offset() {
        return resource$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wl_resource *resource
     * }
     */
    public static MemorySegment resource(MemorySegment struct) {
        return struct.get(resource$LAYOUT, resource$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wl_resource *resource
     * }
     */
    public static void resource(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(resource$LAYOUT, resource$OFFSET, fieldValue);
    }

    private static final OfInt message_opcode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("message_opcode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int message_opcode
     * }
     */
    public static final OfInt message_opcode$layout() {
        return message_opcode$LAYOUT;
    }

    private static final long message_opcode$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int message_opcode
     * }
     */
    public static final long message_opcode$offset() {
        return message_opcode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int message_opcode
     * }
     */
    public static int message_opcode(MemorySegment struct) {
        return struct.get(message_opcode$LAYOUT, message_opcode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int message_opcode
     * }
     */
    public static void message_opcode(MemorySegment struct, int fieldValue) {
        struct.set(message_opcode$LAYOUT, message_opcode$OFFSET, fieldValue);
    }

    private static final AddressLayout message$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("message"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const struct wl_message *message
     * }
     */
    public static final AddressLayout message$layout() {
        return message$LAYOUT;
    }

    private static final long message$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const struct wl_message *message
     * }
     */
    public static final long message$offset() {
        return message$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const struct wl_message *message
     * }
     */
    public static MemorySegment message(MemorySegment struct) {
        return struct.get(message$LAYOUT, message$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const struct wl_message *message
     * }
     */
    public static void message(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(message$LAYOUT, message$OFFSET, fieldValue);
    }

    private static final OfInt arguments_count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("arguments_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int arguments_count
     * }
     */
    public static final OfInt arguments_count$layout() {
        return arguments_count$LAYOUT;
    }

    private static final long arguments_count$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int arguments_count
     * }
     */
    public static final long arguments_count$offset() {
        return arguments_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int arguments_count
     * }
     */
    public static int arguments_count(MemorySegment struct) {
        return struct.get(arguments_count$LAYOUT, arguments_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int arguments_count
     * }
     */
    public static void arguments_count(MemorySegment struct, int fieldValue) {
        struct.set(arguments_count$LAYOUT, arguments_count$OFFSET, fieldValue);
    }

    private static final AddressLayout arguments$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("arguments"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const union wl_argument *arguments
     * }
     */
    public static final AddressLayout arguments$layout() {
        return arguments$LAYOUT;
    }

    private static final long arguments$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const union wl_argument *arguments
     * }
     */
    public static final long arguments$offset() {
        return arguments$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const union wl_argument *arguments
     * }
     */
    public static MemorySegment arguments(MemorySegment struct) {
        return struct.get(arguments$LAYOUT, arguments$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const union wl_argument *arguments
     * }
     */
    public static void arguments(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(arguments$LAYOUT, arguments$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

