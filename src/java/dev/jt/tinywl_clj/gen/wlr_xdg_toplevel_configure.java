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
 * struct wlr_xdg_toplevel_configure {
 *     uint32_t fields;
 *     bool maximized;
 *     bool fullscreen;
 *     bool resizing;
 *     bool activated;
 *     bool suspended;
 *     uint32_t tiled;
 *     int32_t width;
 *     int32_t height;
 *     struct {
 *         int32_t width;
 *         int32_t height;
 *     } bounds;
 *     uint32_t wm_capabilities;
 * }
 * }
 */
public class wlr_xdg_toplevel_configure {

    wlr_xdg_toplevel_configure() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_INT.withName("fields"),
        C.C_BOOL.withName("maximized"),
        C.C_BOOL.withName("fullscreen"),
        C.C_BOOL.withName("resizing"),
        C.C_BOOL.withName("activated"),
        C.C_BOOL.withName("suspended"),
        MemoryLayout.paddingLayout(3),
        C.C_INT.withName("tiled"),
        C.C_INT.withName("width"),
        C.C_INT.withName("height"),
        wlr_xdg_toplevel_configure.bounds.layout().withName("bounds"),
        C.C_INT.withName("wm_capabilities")
    ).withName("wlr_xdg_toplevel_configure");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt fields$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fields"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t fields
     * }
     */
    public static final OfInt fields$layout() {
        return fields$LAYOUT;
    }

    private static final long fields$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t fields
     * }
     */
    public static final long fields$offset() {
        return fields$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t fields
     * }
     */
    public static int fields(MemorySegment struct) {
        return struct.get(fields$LAYOUT, fields$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t fields
     * }
     */
    public static void fields(MemorySegment struct, int fieldValue) {
        struct.set(fields$LAYOUT, fields$OFFSET, fieldValue);
    }

    private static final OfBoolean maximized$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("maximized"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool maximized
     * }
     */
    public static final OfBoolean maximized$layout() {
        return maximized$LAYOUT;
    }

    private static final long maximized$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool maximized
     * }
     */
    public static final long maximized$offset() {
        return maximized$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool maximized
     * }
     */
    public static boolean maximized(MemorySegment struct) {
        return struct.get(maximized$LAYOUT, maximized$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool maximized
     * }
     */
    public static void maximized(MemorySegment struct, boolean fieldValue) {
        struct.set(maximized$LAYOUT, maximized$OFFSET, fieldValue);
    }

    private static final OfBoolean fullscreen$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("fullscreen"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool fullscreen
     * }
     */
    public static final OfBoolean fullscreen$layout() {
        return fullscreen$LAYOUT;
    }

    private static final long fullscreen$OFFSET = 5;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool fullscreen
     * }
     */
    public static final long fullscreen$offset() {
        return fullscreen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool fullscreen
     * }
     */
    public static boolean fullscreen(MemorySegment struct) {
        return struct.get(fullscreen$LAYOUT, fullscreen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool fullscreen
     * }
     */
    public static void fullscreen(MemorySegment struct, boolean fieldValue) {
        struct.set(fullscreen$LAYOUT, fullscreen$OFFSET, fieldValue);
    }

    private static final OfBoolean resizing$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("resizing"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool resizing
     * }
     */
    public static final OfBoolean resizing$layout() {
        return resizing$LAYOUT;
    }

    private static final long resizing$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool resizing
     * }
     */
    public static final long resizing$offset() {
        return resizing$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool resizing
     * }
     */
    public static boolean resizing(MemorySegment struct) {
        return struct.get(resizing$LAYOUT, resizing$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool resizing
     * }
     */
    public static void resizing(MemorySegment struct, boolean fieldValue) {
        struct.set(resizing$LAYOUT, resizing$OFFSET, fieldValue);
    }

    private static final OfBoolean activated$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("activated"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool activated
     * }
     */
    public static final OfBoolean activated$layout() {
        return activated$LAYOUT;
    }

    private static final long activated$OFFSET = 7;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool activated
     * }
     */
    public static final long activated$offset() {
        return activated$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool activated
     * }
     */
    public static boolean activated(MemorySegment struct) {
        return struct.get(activated$LAYOUT, activated$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool activated
     * }
     */
    public static void activated(MemorySegment struct, boolean fieldValue) {
        struct.set(activated$LAYOUT, activated$OFFSET, fieldValue);
    }

    private static final OfBoolean suspended$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("suspended"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool suspended
     * }
     */
    public static final OfBoolean suspended$layout() {
        return suspended$LAYOUT;
    }

    private static final long suspended$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool suspended
     * }
     */
    public static final long suspended$offset() {
        return suspended$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool suspended
     * }
     */
    public static boolean suspended(MemorySegment struct) {
        return struct.get(suspended$LAYOUT, suspended$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool suspended
     * }
     */
    public static void suspended(MemorySegment struct, boolean fieldValue) {
        struct.set(suspended$LAYOUT, suspended$OFFSET, fieldValue);
    }

    private static final OfInt tiled$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tiled"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t tiled
     * }
     */
    public static final OfInt tiled$layout() {
        return tiled$LAYOUT;
    }

    private static final long tiled$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t tiled
     * }
     */
    public static final long tiled$offset() {
        return tiled$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t tiled
     * }
     */
    public static int tiled(MemorySegment struct) {
        return struct.get(tiled$LAYOUT, tiled$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t tiled
     * }
     */
    public static void tiled(MemorySegment struct, int fieldValue) {
        struct.set(tiled$LAYOUT, tiled$OFFSET, fieldValue);
    }

    private static final OfInt width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t width
     * }
     */
    public static final OfInt width$layout() {
        return width$LAYOUT;
    }

    private static final long width$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t width
     * }
     */
    public static final long width$offset() {
        return width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t width
     * }
     */
    public static int width(MemorySegment struct) {
        return struct.get(width$LAYOUT, width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t width
     * }
     */
    public static void width(MemorySegment struct, int fieldValue) {
        struct.set(width$LAYOUT, width$OFFSET, fieldValue);
    }

    private static final OfInt height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t height
     * }
     */
    public static final OfInt height$layout() {
        return height$LAYOUT;
    }

    private static final long height$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t height
     * }
     */
    public static final long height$offset() {
        return height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t height
     * }
     */
    public static int height(MemorySegment struct) {
        return struct.get(height$LAYOUT, height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t height
     * }
     */
    public static void height(MemorySegment struct, int fieldValue) {
        struct.set(height$LAYOUT, height$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     int32_t width;
     *     int32_t height;
     * }
     * }
     */
    public static class bounds {

        bounds() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            C.C_INT.withName("width"),
            C.C_INT.withName("height")
        ).withName("$anon$154:2");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfInt width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("width"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * int32_t width
         * }
         */
        public static final OfInt width$layout() {
            return width$LAYOUT;
        }

        private static final long width$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * int32_t width
         * }
         */
        public static final long width$offset() {
            return width$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * int32_t width
         * }
         */
        public static int width(MemorySegment struct) {
            return struct.get(width$LAYOUT, width$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * int32_t width
         * }
         */
        public static void width(MemorySegment struct, int fieldValue) {
            struct.set(width$LAYOUT, width$OFFSET, fieldValue);
        }

        private static final OfInt height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("height"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * int32_t height
         * }
         */
        public static final OfInt height$layout() {
            return height$LAYOUT;
        }

        private static final long height$OFFSET = 4;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * int32_t height
         * }
         */
        public static final long height$offset() {
            return height$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * int32_t height
         * }
         */
        public static int height(MemorySegment struct) {
            return struct.get(height$LAYOUT, height$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * int32_t height
         * }
         */
        public static void height(MemorySegment struct, int fieldValue) {
            struct.set(height$LAYOUT, height$OFFSET, fieldValue);
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

    private static final GroupLayout bounds$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("bounds"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     int32_t width;
     *     int32_t height;
     * } bounds
     * }
     */
    public static final GroupLayout bounds$layout() {
        return bounds$LAYOUT;
    }

    private static final long bounds$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     int32_t width;
     *     int32_t height;
     * } bounds
     * }
     */
    public static final long bounds$offset() {
        return bounds$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     int32_t width;
     *     int32_t height;
     * } bounds
     * }
     */
    public static MemorySegment bounds(MemorySegment struct) {
        return struct.asSlice(bounds$OFFSET, bounds$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     int32_t width;
     *     int32_t height;
     * } bounds
     * }
     */
    public static void bounds(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, bounds$OFFSET, bounds$LAYOUT.byteSize());
    }

    private static final OfInt wm_capabilities$LAYOUT = (OfInt)$LAYOUT.select(groupElement("wm_capabilities"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t wm_capabilities
     * }
     */
    public static final OfInt wm_capabilities$layout() {
        return wm_capabilities$LAYOUT;
    }

    private static final long wm_capabilities$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t wm_capabilities
     * }
     */
    public static final long wm_capabilities$offset() {
        return wm_capabilities$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t wm_capabilities
     * }
     */
    public static int wm_capabilities(MemorySegment struct) {
        return struct.get(wm_capabilities$LAYOUT, wm_capabilities$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t wm_capabilities
     * }
     */
    public static void wm_capabilities(MemorySegment struct, int fieldValue) {
        struct.set(wm_capabilities$LAYOUT, wm_capabilities$OFFSET, fieldValue);
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
