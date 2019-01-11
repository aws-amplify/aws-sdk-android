
target="$1"

if find $target -mindepth 1 -print -quit 2>/dev/null | grep -q .; then
    echo "$target is not empty. There are test failures"
    exit 1
fi
