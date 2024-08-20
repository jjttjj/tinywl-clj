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
 * struct wlr_addon {
 *     const struct wlr_addon_interface *impl;
 *     const void *owner;
 *     struct wl_list link;
 * }
 * }
 */
public class wlr_addon {

    wlr_addon() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("impl"),
        C.C_POINTER.withName("owner"),
        wl_list.layout().withName("link")
    ).withName("wlr_addon");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout impl$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("impl"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const struct wlr_addon_interface *impl
     * }
     */
    public static final AddressLayout impl$layout() {
        return impl$LAYOUT;
    }

    private static final long impl$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const struct wlr_addon_interface *impl
     * }
     */
    public static final long impl$offset() {
        return impl$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const struct wlr_addon_interface *impl
     * }
     */
    public static MemorySegment impl(MemorySegment struct) {
        return struct.get(impl$LAYOUT, impl$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const struct wlr_addon_interface *impl
     * }
     */
    public static void impl(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(impl$LAYOUT, impl$OFFSET, fieldValue);
    }

    private static final AddressLayout owner$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("owner"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const void *owner
     * }
     */
    public static final AddressLayout owner$layout() {
        return owner$LAYOUT;
    }

    private static final long owner$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const void *owner
     * }
     */
    public static final long owner$offset() {
        return owner$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const void *owner
     * }
     */
    public static MemorySegment owner(MemorySegment struct) {
        return struct.get(owner$LAYOUT, owner$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const void *owner
     * }
     */
    public static void owner(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(owner$LAYOUT, owner$OFFSET, fieldValue);
    }

    private static final GroupLayout link$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("link"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wl_list link
     * }
     */
    public static final GroupLayout link$layout() {
        return link$LAYOUT;
    }

    private static final long link$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wl_list link
     * }
     */
    public static final long link$offset() {
        return link$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wl_list link
     * }
     */
    public static MemorySegment link(MemorySegment struct) {
        return struct.asSlice(link$OFFSET, link$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wl_list link
     * }
     */
    public static void link(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, link$OFFSET, link$LAYOUT.byteSize());
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
