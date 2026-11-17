from pathlib import Path
import re


ROOT = Path(__file__).resolve().parents[2]
README = ROOT / "README.md"


def count_files(extension: str) -> int:
    return sum(
        1
        for path in ROOT.glob(f"[0-9][0-9][0-9][0-9]-*/**/*{extension}")
        if path.is_file()
    )


problem_count = sum(
    1
    for path in ROOT.iterdir()
    if path.is_dir() and re.fullmatch(r"\d{4}-.+", path.name)
)
java_count = count_files(".java")
sql_count = count_files(".sql")

content = README.read_text()
content, problems_updated = re.subn(
    r"(\| Problems solved \| )\d+( \|)",
    rf"\g<1>{problem_count}\g<2>",
    content,
)
content, java_updated = re.subn(
    r"(\| Java solutions \| )\d+( \|)",
    rf"\g<1>{java_count}\g<2>",
    content,
)
content, sql_updated = re.subn(
    r"(\| SQL solutions \| )\d+( \|)",
    rf"\g<1>{sql_count}\g<2>",
    content,
)

if not all((problems_updated, java_updated, sql_updated)):
    raise SystemExit("README progress table could not be updated")

README.write_text(content)
