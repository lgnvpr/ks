USE [master]
GO
/****** Object:  Database [QuanLiKhachSan_Nhom1]    Script Date: 08-Aug-20 9:17:43 AM ******/
CREATE DATABASE [QuanLiKhachSan_Nhom1]
 CONTAINMENT = NONE
GO

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QuanLiKhachSan_Nhom1].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET ARITHABORT OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET RECOVERY FULL 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET  MULTI_USER 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'QuanLiKhachSan_Nhom1', N'ON'
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET QUERY_STORE = OFF
GO
USE [QuanLiKhachSan_Nhom1]
GO
/****** Object:  Table [dbo].[ChiPhatSinh]    Script Date: 08-Aug-20 9:17:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiPhatSinh](
	[MaChiPhatSinh] [int] NOT NULL,
	[SoTienPhatSinh] [money] NULL,
	[MaNhanVien] [char](5) NULL,
	[MoTa] [ntext] NULL,
	[NgayPhatSinh] [datetime] NULL,
 CONSTRAINT [PK_ChiPhatSinh] PRIMARY KEY CLUSTERED 
(
	[MaChiPhatSinh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChiTietDichVu]    Script Date: 08-Aug-20 9:17:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietDichVu](
	[MaCTDV] [int] NOT NULL,
	[MaPhieuDichVu] [int] NULL,
	[MaDichVu] [int] NULL,
	[NgaySuDung] [datetime] NULL,
	[MoTa] [ntext] NULL,
 CONSTRAINT [PK_ChiTietDichVu] PRIMARY KEY CLUSTERED 
(
	[MaCTDV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChucVu]    Script Date: 08-Aug-20 9:17:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChucVu](
	[MaChucVu] [char](4) NOT NULL,
	[TenChucVu] [nvarchar](20) NULL,
	[MoTa] [ntext] NULL,
 CONSTRAINT [PK_ChucVu] PRIMARY KEY CLUSTERED 
(
	[MaChucVu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CTPhieuThue]    Script Date: 08-Aug-20 9:17:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTPhieuThue](
	[MaChiTietPhieuThue] [int] NOT NULL,
	[MaPhieuThue] [int] NOT NULL,
	[MaKhachHang] [int] NOT NULL,
 CONSTRAINT [PK_CTPhieuThue] PRIMARY KEY CLUSTERED 
(
	[MaChiTietPhieuThue] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DichVu]    Script Date: 08-Aug-20 9:17:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DichVu](
	[MaDichVu] [int] NOT NULL,
	[TenDichVu] [varchar](30) NULL,
	[MaLoaiDichVu] [char](4) NULL,
	[SoLuongVatChat] [nchar](10) NULL,
	[MaVatChat] [nchar](10) NULL,
	[DonGia] [money] NULL,
	[DonVi] [nvarchar](15) NULL,
	[MoTa] [ntext] NULL,
 CONSTRAINT [PK_DichVu] PRIMARY KEY CLUSTERED 
(
	[MaDichVu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 08-Aug-20 9:17:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKhachHang] [int] IDENTITY(1,1) NOT NULL,
	[TenKhachHang] [nvarchar](50) NULL,
	[CMND] [varchar](12) NULL,
	[MaLoaiKhachHang] [char](5) NULL,
	[SDT] [varchar](10) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[NgaySinh] [date] NULL,
	[GioiTinh] [bit] NULL,
	[MoTa] [ntext] NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[MaKhachHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhuVuc]    Script Date: 08-Aug-20 9:17:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhuVuc](
	[MaKhuVuc] [char](4) NOT NULL,
	[TenKhuVuc] [varchar](50) NULL,
	[MoTa] [ntext] NULL,
 CONSTRAINT [PK_KhuVuc] PRIMARY KEY CLUSTERED 
(
	[MaKhuVuc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiDichVu]    Script Date: 08-Aug-20 9:17:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiDichVu](
	[MaLoaiDichVu] [char](4) NOT NULL,
	[TenLoaiDichVu] [nvarchar](30) NULL,
	[MoTa] [ntext] NULL,
 CONSTRAINT [PK_LoaiDichVu] PRIMARY KEY CLUSTERED 
(
	[MaLoaiDichVu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiKhachHang]    Script Date: 08-Aug-20 9:17:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiKhachHang](
	[MaLoaiKhachHang] [char](5) NOT NULL,
	[TenLoaiKhachHang] [nvarchar](150) NULL,
	[PhanTramGiam] [int] NULL,
	[MoTa] [ntext] NULL,
 CONSTRAINT [PK_LoaiKhachHang] PRIMARY KEY CLUSTERED 
(
	[MaLoaiKhachHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiPhong]    Script Date: 08-Aug-20 9:17:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiPhong](
	[MaLoaiPhong] [char](3) NOT NULL,
	[TenLoaiPhong] [nvarchar](50) NOT NULL,
	[GiaPhong] [money] NOT NULL,
	[MoTa] [ntext] NULL,
 CONSTRAINT [PK_LoaiPhong] PRIMARY KEY CLUSTERED 
(
	[MaLoaiPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiThue]    Script Date: 08-Aug-20 9:17:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiThue](
	[MaLoaiThue] [char](5) NOT NULL,
	[TenLoaiThue] [nvarchar](50) NULL,
	[GiaBanDau] [money] NULL,
	[GiaTiepTheo] [money] NULL,
	[MoTa] [ntext] NULL,
 CONSTRAINT [PK_LoaiThue] PRIMARY KEY CLUSTERED 
(
	[MaLoaiThue] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 08-Aug-20 9:17:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNhanVien] [char](5) NOT NULL,
	[TenNhanVien] [nvarchar](50) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[SoDienThoai] [varchar](11) NULL,
	[GioiTinh] [bit] NULL,
	[NgayVaoLam] [date] NULL,
	[MaChucVu] [char](4) NULL,
	[TenDangNhap] [varchar](30) NULL,
	[MatKhau] [varchar](30) NULL,
	[NgaySinh] [date] NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuDichVu]    Script Date: 08-Aug-20 9:17:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuDichVu](
	[MaPhieuDichVu] [int] NOT NULL,
	[NgayLapPhieu] [datetime] NULL,
	[MaPhieuThue] [int] NULL,
	[MaNhanVien] [char](5) NULL,
 CONSTRAINT [PK_PhieuDichVu] PRIMARY KEY CLUSTERED 
(
	[MaPhieuDichVu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuThue]    Script Date: 08-Aug-20 9:17:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuThue](
	[MaPhieuThue] [int] NOT NULL,
	[MaPhong] [char](4) NULL,
	[MaLoaiThue] [char](5) NULL,
	[MaNhanVien] [char](5) NULL,
	[NgayThue] [date] NOT NULL,
	[TienDatCoc] [money] NOT NULL,
	[MoTa] [ntext] NULL,
 CONSTRAINT [PK_PhieuThue] PRIMARY KEY CLUSTERED 
(
	[MaPhieuThue] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Phong]    Script Date: 08-Aug-20 9:17:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Phong](
	[MaPhong] [char](4) NOT NULL,
	[MaKhuVuc] [char](4) NOT NULL,
	[MaLoaiPhong] [char](3) NOT NULL,
	[TinhTrangPhong] [nvarchar](20) NOT NULL,
	[MoTa] [ntext] NULL,
 CONSTRAINT [PK_Phong] PRIMARY KEY CLUSTERED 
(
	[MaPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoanDangNhap]    Script Date: 08-Aug-20 9:17:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoanDangNhap](
	[MaNhanVien] [char](5) NOT NULL,
	[TaiKhoan] [varchar](20) NULL,
	[MatKhau] [varchar](30) NULL,
 CONSTRAINT [PK_TaiKhoanDangNhap] PRIMARY KEY CLUSTERED 
(
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ThuPhatSinh]    Script Date: 08-Aug-20 9:17:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThuPhatSinh](
	[MaPhatSinh] [int] NOT NULL,
	[MoTa] [ntext] NULL,
	[money] [money] NULL,
	[MaNhanVien] [char](5) NULL,
	[NgayPhatSinh] [datetime] NULL,
 CONSTRAINT [PK_ThuPhatSinh] PRIMARY KEY CLUSTERED 
(
	[MaPhatSinh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[KhachHang] ON 

INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [CMND], [MaLoaiKhachHang], [SDT], [DiaChi], [NgaySinh], [GioiTinh], [MoTa]) VALUES (2, N'Nguy?n Van Tèo', N'231306359', N'LKH01', N'0393457112', N'Buôn Mê Thu?t', CAST(N'2001-01-01' AS Date), 1, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [CMND], [MaLoaiKhachHang], [SDT], [DiaChi], [NgaySinh], [GioiTinh], [MoTa]) VALUES (3, N'Phan Van Ch?i', N'231306351', N'LKH01', N'0393457113', N'Buôn Mê Thu?t', CAST(N'2001-01-01' AS Date), 1, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [CMND], [MaLoaiKhachHang], [SDT], [DiaChi], [NgaySinh], [GioiTinh], [MoTa]) VALUES (4, N'Mai Thành Công', N'231306328', N'LKH01', N'0393457114', N'Buôn Mê Thu?t', CAST(N'2001-01-01' AS Date), 1, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [CMND], [MaLoaiKhachHang], [SDT], [DiaChi], [NgaySinh], [GioiTinh], [MoTa]) VALUES (5, N'Ð? Van R?t', N'231306338', N'LKH01', N'0393457115', N'Buôn Mê Thu?t', CAST(N'2001-01-01' AS Date), 1, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [CMND], [MaLoaiKhachHang], [SDT], [DiaChi], [NgaySinh], [GioiTinh], [MoTa]) VALUES (6, N'Mai Com Pu To', N'231346358', N'LKH01', N'0393457116', N'Buôn Mê Thu fjsdklafsad', CAST(N'2000-12-31' AS Date), 1, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [CMND], [MaLoaiKhachHang], [SDT], [DiaChi], [NgaySinh], [GioiTinh], [MoTa]) VALUES (7, N'Nguyễn Văn lương', N'231306558', N'LKH01', N'0393457117', N'Buôn Mê Thu?t', CAST(N'2000-12-31' AS Date), 1, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [CMND], [MaLoaiKhachHang], [SDT], [DiaChi], [NgaySinh], [GioiTinh], [MoTa]) VALUES (8, N'Lê Van Chín', N'231306658', N'LKH01', N'0393457118', N'Buôn Mê Thu?t', CAST(N'2001-01-01' AS Date), 1, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [CMND], [MaLoaiKhachHang], [SDT], [DiaChi], [NgaySinh], [GioiTinh], [MoTa]) VALUES (9, N'Lê Th? L?t', N'231306378', N'LKH01', N'0393457119', N'Buôn Mê Thu?t', CAST(N'2001-01-01' AS Date), 1, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [CMND], [MaLoaiKhachHang], [SDT], [DiaChi], [NgaySinh], [GioiTinh], [MoTa]) VALUES (10, N'Võ S? Quy?n Nang', N'281306358', N'LKH01', N'0393147122', N'Buôn Mê Thu?t', CAST(N'2001-01-01' AS Date), 1, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [CMND], [MaLoaiKhachHang], [SDT], [DiaChi], [NgaySinh], [GioiTinh], [MoTa]) VALUES (11, N'Ph?m Nhân', N'231306359', N'LKH01', N'0393893712', N'Buôn Mê Thu?t', CAST(N'2001-01-01' AS Date), 1, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [CMND], [MaLoaiKhachHang], [SDT], [DiaChi], [NgaySinh], [GioiTinh], [MoTa]) VALUES (12, N'Lò Vi Sóng', N'232306358', N'LKH01', N'0393938122', N'Buôn Mê Thu?t', CAST(N'2001-01-01' AS Date), 1, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [CMND], [MaLoaiKhachHang], [SDT], [DiaChi], [NgaySinh], [GioiTinh], [MoTa]) VALUES (13, N'L? Th? Thu Th?a', N'233306358', N'LKH01', N'0398297122', N'Buôn Mê Thu?t', CAST(N'2001-01-01' AS Date), 1, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [CMND], [MaLoaiKhachHang], [SDT], [DiaChi], [NgaySinh], [GioiTinh], [MoTa]) VALUES (14, N'H? Ông Giám', N'232230658', N'LKH01', N'0393498222', N'Buôn Mê Thu?t', CAST(N'2001-01-01' AS Date), 1, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [CMND], [MaLoaiKhachHang], [SDT], [DiaChi], [NgaySinh], [GioiTinh], [MoTa]) VALUES (15, N'Sa Th? Hoa', N'231146358', N'LKH01', N'0393458292', N'Buôn Mê Thu?t', CAST(N'2001-01-01' AS Date), 1, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [CMND], [MaLoaiKhachHang], [SDT], [DiaChi], [NgaySinh], [GioiTinh], [MoTa]) VALUES (17, N'Nguyễn văn Lương', N'231306338', N'LKH01', N'0393457115', N'Gia Lai', CAST(N'2000-12-31' AS Date), 1, N'')
SET IDENTITY_INSERT [dbo].[KhachHang] OFF
GO
INSERT [dbo].[KhuVuc] ([MaKhuVuc], [TenKhuVuc], [MoTa]) VALUES (N'KV01', N'ALL', N'Tất cả')
GO
INSERT [dbo].[LoaiKhachHang] ([MaLoaiKhachHang], [TenLoaiKhachHang], [PhanTramGiam], [MoTa]) VALUES (N'LKH01', N'Mới', 0, N'sprint 1')
GO
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiaPhong], [MoTa]) VALUES (N'L01', N'Hai Giường Thường', 200000.0000, NULL)
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiaPhong], [MoTa]) VALUES (N'L02', N'Một Gường Thường', 300000.0000, NULL)
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiaPhong], [MoTa]) VALUES (N'L03', N'Hai Giường VP', 50000000000.0000, N'')
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiaPhong], [MoTa]) VALUES (N'L04', N'VIP', 500000.0000, NULL)
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiaPhong], [MoTa]) VALUES (N'L05', N'Siêu Vip', 60000000000000.0000, N'ahihihi')
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiaPhong], [MoTa]) VALUES (N'L06', N'Hai Giường VPfas', 4000000000.0000, N'')
GO
INSERT [dbo].[Phong] ([MaPhong], [MaKhuVuc], [MaLoaiPhong], [TinhTrangPhong], [MoTa]) VALUES (N'P101', N'KV01', N'L01', N'Tr?ng', N'AHihi')
INSERT [dbo].[Phong] ([MaPhong], [MaKhuVuc], [MaLoaiPhong], [TinhTrangPhong], [MoTa]) VALUES (N'P102', N'KV01', N'L01', N'Tr?ng', N'AHihi')
INSERT [dbo].[Phong] ([MaPhong], [MaKhuVuc], [MaLoaiPhong], [TinhTrangPhong], [MoTa]) VALUES (N'P104', N'KV01', N'L02', N'Tr?ng', N'AHihi')
INSERT [dbo].[Phong] ([MaPhong], [MaKhuVuc], [MaLoaiPhong], [TinhTrangPhong], [MoTa]) VALUES (N'P105', N'KV01', N'L01', N'Tr?ng', N'AHihi')
INSERT [dbo].[Phong] ([MaPhong], [MaKhuVuc], [MaLoaiPhong], [TinhTrangPhong], [MoTa]) VALUES (N'P106', N'KV01', N'L03', N'Tr?ng', N'AHihi')
INSERT [dbo].[Phong] ([MaPhong], [MaKhuVuc], [MaLoaiPhong], [TinhTrangPhong], [MoTa]) VALUES (N'P107', N'KV01', N'L04', N'Tr?ng', N'AHihi')
INSERT [dbo].[Phong] ([MaPhong], [MaKhuVuc], [MaLoaiPhong], [TinhTrangPhong], [MoTa]) VALUES (N'P108', N'KV01', N'L02', N'Tr?ng', N'AHihi')
INSERT [dbo].[Phong] ([MaPhong], [MaKhuVuc], [MaLoaiPhong], [TinhTrangPhong], [MoTa]) VALUES (N'P109', N'KV01', N'L04', N'Tr?ng', N'AHihi')
INSERT [dbo].[Phong] ([MaPhong], [MaKhuVuc], [MaLoaiPhong], [TinhTrangPhong], [MoTa]) VALUES (N'P201', N'KV01', N'L01', N'Tr?ng', N'AHihi')
INSERT [dbo].[Phong] ([MaPhong], [MaKhuVuc], [MaLoaiPhong], [TinhTrangPhong], [MoTa]) VALUES (N'P202', N'KV01', N'L04', N'Tr?ng', N'AHihi')
INSERT [dbo].[Phong] ([MaPhong], [MaKhuVuc], [MaLoaiPhong], [TinhTrangPhong], [MoTa]) VALUES (N'P203', N'KV01', N'L02', N'Tr?ng', N'AHihi')
INSERT [dbo].[Phong] ([MaPhong], [MaKhuVuc], [MaLoaiPhong], [TinhTrangPhong], [MoTa]) VALUES (N'P204', N'KV01', N'L02', N'Tr?ng', N'AHihi')
INSERT [dbo].[Phong] ([MaPhong], [MaKhuVuc], [MaLoaiPhong], [TinhTrangPhong], [MoTa]) VALUES (N'P205', N'KV01', N'L03', N'Tr?ng', N'AHihi')
INSERT [dbo].[Phong] ([MaPhong], [MaKhuVuc], [MaLoaiPhong], [TinhTrangPhong], [MoTa]) VALUES (N'P206', N'KV01', N'L02', N'Tr?ng', N'AHihi')
INSERT [dbo].[Phong] ([MaPhong], [MaKhuVuc], [MaLoaiPhong], [TinhTrangPhong], [MoTa]) VALUES (N'P207', N'KV01', N'L01', N'Tr?ng', N'AHihi')
INSERT [dbo].[Phong] ([MaPhong], [MaKhuVuc], [MaLoaiPhong], [TinhTrangPhong], [MoTa]) VALUES (N'P208', N'KV01', N'L04', N'Tr?ng', N'AHihi')
INSERT [dbo].[Phong] ([MaPhong], [MaKhuVuc], [MaLoaiPhong], [TinhTrangPhong], [MoTa]) VALUES (N'P209', N'KV01', N'L01', N'Tr?ng', N'AHihi')
GO
ALTER TABLE [dbo].[ChiPhatSinh]  WITH CHECK ADD  CONSTRAINT [FK_ChiPhatSinh_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[ChiPhatSinh] CHECK CONSTRAINT [FK_ChiPhatSinh_NhanVien]
GO
ALTER TABLE [dbo].[ChiTietDichVu]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietDichVu_DichVu] FOREIGN KEY([MaDichVu])
REFERENCES [dbo].[DichVu] ([MaDichVu])
GO
ALTER TABLE [dbo].[ChiTietDichVu] CHECK CONSTRAINT [FK_ChiTietDichVu_DichVu]
GO
ALTER TABLE [dbo].[ChiTietDichVu]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietDichVu_PhieuDichVu] FOREIGN KEY([MaPhieuDichVu])
REFERENCES [dbo].[PhieuDichVu] ([MaPhieuDichVu])
GO
ALTER TABLE [dbo].[ChiTietDichVu] CHECK CONSTRAINT [FK_ChiTietDichVu_PhieuDichVu]
GO
ALTER TABLE [dbo].[CTPhieuThue]  WITH CHECK ADD  CONSTRAINT [FK_CTPhieuThue_KhachHang] FOREIGN KEY([MaKhachHang])
REFERENCES [dbo].[KhachHang] ([MaKhachHang])
GO
ALTER TABLE [dbo].[CTPhieuThue] CHECK CONSTRAINT [FK_CTPhieuThue_KhachHang]
GO
ALTER TABLE [dbo].[CTPhieuThue]  WITH CHECK ADD  CONSTRAINT [FK_CTPhieuThue_PhieuThue] FOREIGN KEY([MaPhieuThue])
REFERENCES [dbo].[PhieuThue] ([MaPhieuThue])
GO
ALTER TABLE [dbo].[CTPhieuThue] CHECK CONSTRAINT [FK_CTPhieuThue_PhieuThue]
GO
ALTER TABLE [dbo].[DichVu]  WITH CHECK ADD  CONSTRAINT [FK_DichVu_LoaiDichVu] FOREIGN KEY([MaLoaiDichVu])
REFERENCES [dbo].[LoaiDichVu] ([MaLoaiDichVu])
GO
ALTER TABLE [dbo].[DichVu] CHECK CONSTRAINT [FK_DichVu_LoaiDichVu]
GO
ALTER TABLE [dbo].[KhachHang]  WITH CHECK ADD  CONSTRAINT [FK_KhachHang_LoaiKhachHang] FOREIGN KEY([MaLoaiKhachHang])
REFERENCES [dbo].[LoaiKhachHang] ([MaLoaiKhachHang])
GO
ALTER TABLE [dbo].[KhachHang] CHECK CONSTRAINT [FK_KhachHang_LoaiKhachHang]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_ChucVu] FOREIGN KEY([MaChucVu])
REFERENCES [dbo].[ChucVu] ([MaChucVu])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_ChucVu]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_TaiKhoanDangNhap] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[TaiKhoanDangNhap] ([MaNhanVien])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_TaiKhoanDangNhap]
GO
ALTER TABLE [dbo].[PhieuThue]  WITH CHECK ADD  CONSTRAINT [FK_PhieuThue_LoaiThue] FOREIGN KEY([MaLoaiThue])
REFERENCES [dbo].[LoaiThue] ([MaLoaiThue])
GO
ALTER TABLE [dbo].[PhieuThue] CHECK CONSTRAINT [FK_PhieuThue_LoaiThue]
GO
ALTER TABLE [dbo].[PhieuThue]  WITH CHECK ADD  CONSTRAINT [FK_PhieuThue_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[PhieuThue] CHECK CONSTRAINT [FK_PhieuThue_NhanVien]
GO
ALTER TABLE [dbo].[PhieuThue]  WITH CHECK ADD  CONSTRAINT [FK_PhieuThue_Phong] FOREIGN KEY([MaPhong])
REFERENCES [dbo].[Phong] ([MaPhong])
GO
ALTER TABLE [dbo].[PhieuThue] CHECK CONSTRAINT [FK_PhieuThue_Phong]
GO
ALTER TABLE [dbo].[Phong]  WITH CHECK ADD  CONSTRAINT [FK_Phong_KhuVuc] FOREIGN KEY([MaKhuVuc])
REFERENCES [dbo].[KhuVuc] ([MaKhuVuc])
GO
ALTER TABLE [dbo].[Phong] CHECK CONSTRAINT [FK_Phong_KhuVuc]
GO
ALTER TABLE [dbo].[Phong]  WITH CHECK ADD  CONSTRAINT [FK_Phong_LoaiPhong] FOREIGN KEY([MaLoaiPhong])
REFERENCES [dbo].[LoaiPhong] ([MaLoaiPhong])
GO
ALTER TABLE [dbo].[Phong] CHECK CONSTRAINT [FK_Phong_LoaiPhong]
GO
ALTER TABLE [dbo].[ThuPhatSinh]  WITH CHECK ADD  CONSTRAINT [FK_ThuPhatSinh_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[ThuPhatSinh] CHECK CONSTRAINT [FK_ThuPhatSinh_NhanVien]
GO
ALTER TABLE [dbo].[LoaiPhong]  WITH CHECK ADD  CONSTRAINT [CK_LoaiPhong_GiaPhong] CHECK  (([GiaPhong]>=(0)))
GO
ALTER TABLE [dbo].[LoaiPhong] CHECK CONSTRAINT [CK_LoaiPhong_GiaPhong]
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'LoaiPhong', @level2type=N'CONSTRAINT',@level2name=N'CK_LoaiPhong_GiaPhong'
GO
USE [master]
GO
ALTER DATABASE [QuanLiKhachSan_Nhom1] SET  READ_WRITE 
GO
