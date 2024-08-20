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
 * struct wlr_dmabuf_v1_buffer {
 *     struct wlr_buffer base;
 *     struct wl_resource *resource;
 *     struct wlr_dmabuf_attributes attributes;
 *     struct wl_listener release;
 * }
 * }
 */
public class wlr_dmabuf_v1_buffer {

    wlr_dmabuf_v1_buffer() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wlr_buffer.layout().withName("base"),
        C.C_POINTER.withName("resource"),
        wlr_dmabuf_attributes.layout().withName("attributes"),
        wl_listener.layout().withName("release")
    ).withName("wlr_dmabuf_v1_buffer");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout base$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("base"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_buffer base
     * }
     */
    public static final GroupLayout base$layout() {
        return base$LAYOUT;
    }

    private static final long base$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_buffer base
     * }
     */
    public static final long base$offset() {
        return base$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_buffer base
     * }
     */
    public static MemorySegment base(MemorySegment struct) {
        return struct.asSlice(base$OFFSET, base$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_buffer base
     * }
     */
    public static void base(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, base$OFFSET, base$LAYOUT.byteSize());
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

    private static final long resource$OFFSET = 88;

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

    private static final GroupLayout attributes$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("attributes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_dmabuf_attributes attributes
     * }
     */
    public static final GroupLayout attributes$layout() {
        return attributes$LAYOUT;
    }

    private static final long attributes$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_dmabuf_attributes attributes
     * }
     */
    public static final long attributes$offset() {
        return attributes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_dmabuf_attributes attributes
     * }
     */
    public static MemorySegment attributes(MemorySegment struct) {
        return struct.asSlice(attributes$OFFSET, attributes$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_dmabuf_attributes attributes
     * }
     */
    public static void attributes(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, attributes$OFFSET, attributes$LAYOUT.byteSize());
    }

    private static final GroupLayout release$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("release"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wl_listener release
     * }
     */
    public static final GroupLayout release$layout() {
        return release$LAYOUT;
    }

    private static final long release$OFFSET = 176;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wl_listener release
     * }
     */
    public static final long release$offset() {
        return release$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wl_listener release
     * }
     */
    public static MemorySegment release(MemorySegment struct) {
        return struct.asSlice(release$OFFSET, release$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wl_listener release
     * }
     */
    public static void release(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, release$OFFSET, release$LAYOUT.byteSize());
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

