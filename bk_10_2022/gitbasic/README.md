/git_day1
Getting Started

Nội dung:
    Tìm hiểu và thao tác với các câu lệnh cơ bản về git:
        git init
        git add
        git status
        git comit
        git diff
Tạo tài khoản github

/git_day2'
	git config --global user.name "congnguyen7"
	git config --global user.email "congnguyen@bkitsolution.com"
	cat ~/.gitconfig
	git config --list
	
	git clone https://github.com/congnguyen7/gitbasic.git
	cd gitbasic/
	echo "gitbasic " >> README.md
	cat README.md
	git add .
	git status
	git commit -m "first commit"
	git branch -M main
	git push origin main

	git config --global user.name "congnguyen7"
	git config --global user.email "congnguyen@bkitsolution.com"
	cat ~/.gitconfig
	git config --list


/git_day3
	git commit –amend được sử dụng khi chúng ta muốn sửa đổi commit cuối cùng. 
		https://bom.so/58bVZ4 
	gitignore
		build/ :Bỏ qua mọi tập tin trong các thư mục có tên là build
		*.log   :yêu cầu Git bỏ qua tất cả các tập tin logs
		"!lib.a"  :không bỏ qua tập tin lib.a
		/TODO :Chỉ bỏ qua file TODO ở thư mục hiện tại, còn ở các thư mục con thì không
	git log
	git log --online
	git show
	gitk : quan sát trực quan lịch sử commit nội dung thay đổi các commit 
	BRANCH : thêm, xóa, chuyển branch
	merge
s
