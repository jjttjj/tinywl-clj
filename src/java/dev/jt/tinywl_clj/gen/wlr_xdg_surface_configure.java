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
 * struct wlr_xdg_surface_configure {
 *     struct wlr_xdg_surface *surface;
 *     struct wl_list link;
 *     uint32_t serial;
 *     union {
 *         struct wlr_xdg_toplevel_configure *toplevel_configure;
 *         struct wlr_xdg_popup_configure *popup_configure;
 *     };
 * }
 * }
 */
public class wlr_xdg_surface_configure {

    wlr_xdg_surface_configure() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("surface"),
        wl_list.layout().withName("link"),
        C.C_INT.withName("serial"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.unionLayout(
            C.C_POINTER.withName("toplevel_configure"),
            C.C_POINTER.withName("popup_configure")
        ).withName("$anon$212:2")
    ).withName("wlr_xdg_surface_configure");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout surface$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("surface"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_xdg_surface *surface
     * }
     */
    public static final AddressLayout surface$layout() {
        return surface$LAYOUT;
    }

    private static final long surface$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_xdg_surface *surface
     * }
     */
    public static final long surface$offset() {
        return surface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_surface *surface
     * }
     */
    public static MemorySegment surface(MemorySegment struct) {
        return struct.get(surface$LAYOUT, surface$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_surface *surface
     * }
     */
    public static void surface(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(surface$LAYOUT, surface$OFFSET, fieldValue);
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

    private static final long link$OFFSET = 8;

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

    private static final OfInt serial$LAYOUT = (OfInt)$LAYOUT.select(groupElement("serial"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t serial
     * }
     */
    public static final OfInt serial$layout() {
        return serial$LAYOUT;
    }

    private static final long serial$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t serial
     * }
     */
    public static final long serial$offset() {
        return serial$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t serial
     * }
     */
    public static int serial(MemorySegment struct) {
        return struct.get(serial$LAYOUT, serial$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t serial
     * }
     */
    public static void serial(MemorySegment struct, int fieldValue) {
        struct.set(serial$LAYOUT, serial$OFFSET, fieldValue);
    }

    private static final AddressLayout toplevel_configure$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$212:2"), groupElement("toplevel_configure"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_configure *toplevel_configure
     * }
     */
    public static final AddressLayout toplevel_configure$layout() {
        return toplevel_configure$LAYOUT;
    }

    private static final long toplevel_configure$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_configure *toplevel_configure
     * }
     */
    public static final long toplevel_configure$offset() {
        return toplevel_configure$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_configure *toplevel_configure
     * }
     */
    public static MemorySegment toplevel_configure(MemorySegment struct) {
        return struct.get(toplevel_configure$LAYOUT, toplevel_configure$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_configure *toplevel_configure
     * }
     */
    public static void toplevel_configure(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(toplevel_configure$LAYOUT, toplevel_configure$OFFSET, fieldValue);
    }

    private static final AddressLayout popup_configure$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$212:2"), groupElement("popup_configure"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_xdg_popup_configure *popup_configure
     * }
     */
    public static final AddressLayout popup_configure$layout() {
        return popup_configure$LAYOUT;
    }

    private static final long popup_configure$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_xdg_popup_configure *popup_configure
     * }
     */
    public static final long popup_configure$offset() {
        return popup_configure$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_popup_configure *popup_configure
     * }
     */
    public static MemorySegment popup_configure(MemorySegment struct) {
        return struct.get(popup_configure$LAYOUT, popup_configure$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_popup_configure *popup_configure
     * }
     */
    public static void popup_configure(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(popup_configure$LAYOUT, popup_configure$OFFSET, fieldValue);
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

